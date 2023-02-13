import { useEffect, useState } from 'react';
import './App.css';
import styled, { ThemeProvider } from 'styled-components';

import CharacterForm from './CharacterForm';
import { getAllCharacters } from './CharacterService';

const Title = styled.h1`
    text-align: center;
`;

const theme = {
    headerColour: '#e5feff',
    checkedInColour: 'rgb(104 185 255 / 50%)',
    checkedOutColor: 'white',
};


function App() {


const [characters, setCharacters] = useState([]);

  useEffect( () => {
    //fetch /characters
    fetch("http://192.168.100.46:8080/characters")
      .then(res=> res.json())
      .then(data=> setCharacters(data));
  }, [])

  const characterItems = characters.map((character) => {
    return <li key={character.id}>{character.name}</li>
  })


  const addCharacter = (character) => {
      const newCharacters = [...characters, character];
      setCharacters(newCharacters)
  };
  
  return <>
  <ThemeProvider theme={theme}>
      <Title>Character Creator</Title>
      <CharacterForm addCharacter={addCharacter} />
  </ThemeProvider>
</>
}

export default App;
