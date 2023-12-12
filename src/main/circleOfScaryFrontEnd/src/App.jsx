import { useState, useEffect } from 'react';
import reactLogo from './assets/react.svg';
import viteLogo from '/vite.svg';
import './App.css';
import scaleName from "./services/scaleName"

function App() {
  const [scale, setScale] = useState([])
  const [userInput,setUserInput] = useState("");


const onChangeComboBox = (e) => {
  const selectedId = e.target.value;
  const selectedScaleState = scaleName.filter((s) => s.id == selectedId) [0];
  console.log(selectedScaleState);
  setUserInput(selectedScaleState);
}



  useEffect(() => {
    //let UserInput = document.getElementById("scale");
    
    setUserInput(document.getElementById("scaleSel").value);
    console.log(userInput);
 

    fetch("http://localhost:8080/api/scale/" + userInput)
      .then((res) => res.json())
      .then((data) => setScale(data))

     



  }, [userInput])

  return (
    <>
      <h1 >Welcome to the circle of scary.com!</h1>

      <div>

        <img src="../public/pictures/CirleOfScary.jpg" alt="circleofscary" width="500" height="500" />

        <div className="container">
          <form method="get">

            <div className="form-control col">

              <select id="scaleSel"
              onChange={(e)=> {
                onChangeComboBox(e);
              } }>
              {scaleName.map((s) => (
                  <option key={s.id} value={s.id}>
                    {s.value}
                    </option>)
              )}
               
                 
              </select>


              <select id="mode">
                <option value="Major">Major</option>
                <option value="Minor">Minor</option>
              </select>

            </div>

            <br />


            <button className="btn btn-primary" type="submit" >
              Submit
            </button>

          </form>

        </div>


        <div id ="Output">
        <h1>You have chosen {scale.songKey} Major</h1>
        <h1>Here is the {scale.songKey} Major scale</h1>
        <h2>{scale.majorScale} <br/></h2>

        <h1>Here are the chords that work in {scale.songKey} Major</h1>
        <h2>{scale.chordsInKeyMajor}<br/></h2>

        <h1>Here are the relitive scale modes for {scale.songKey} Major</h1>
        <h2>Ionian (major) {scale.majorScale}</h2>
        <h2>Dorian {scale.dorianScale}</h2>
        <h2>Phrygian {scale.phrygianScale}</h2>
        <h2>Lydian {scale.lydianScale}</h2>
        <h2>Mixolydian {scale.mixolydianScale}</h2>
        <h2>Aeolian (Minor) {scale.minorScale}</h2>
        <h2>Locrian {scale.locrianScale}</h2>
        </div>
        



      </div>

    </>
  )
}

export default App
