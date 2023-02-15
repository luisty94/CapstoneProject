import { useEffect, useState } from 'react';
import './App.css';
import styled, { ThemeProvider } from 'styled-components';
import { createGlobalStyle } from 'styled-components';
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import GameLogic from './containers/GameLogic';
import React from 'react';


function App() {
  
  return (
    <Main>
      <GlobalStyle/>
      <Router>
        <Routes>
          <Route path="/" element={< GameLogic />} />
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
  }
`

const Main = styled.div`
`


export default App;
