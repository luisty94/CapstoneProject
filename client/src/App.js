import { useEffect, useState } from 'react';
import './App.css';
import styled, { ThemeProvider } from 'styled-components';
import { createGlobalStyle } from 'styled-components';
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import GameLogic from './containers/GameLogic';
import React from 'react';


function App() {

  const [background, setBackground] = useState("");

  const updateBackground = (background) => {
    setBackground(background);
  }
  
  return (
    <Main>
      <GlobalStyle background={background}/>
      <Router>
        <Routes>
          <Route path="/" element={< GameLogic  updateBackground={updateBackground} />} />
        </Routes>
      </Router>
    </Main>
  )
}

const GlobalStyle = createGlobalStyle`
body {
  font-family: Arial, Helvetica, sans-serif;
  font-size: 1rem;
  color: black;
  background-image: url(${(props) => props.background});
  background-size: cover;
  background-position: center center;
  background-repeat: no-repeat;
  }
`

const Main = styled.div`
`


export default App;
