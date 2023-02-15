import React, { useState, useEffect } from 'react';
import { getAllCharacters } from '../CharacterService';
import { postCharacter } from '../CharacterService';

import CharacterForm from './CharacterForm';
import PreCombatScreen from './PreCombatScreen';
import CombatScreen from './CombatScreen';
import SuccessScreen from './SuccessScreen';


const GameLogic = () => {

    const [stage, changeStage] = useState("Start");
    const [characters, setCharacters] = useState([]);
    const [activeCharacter, setActiveCharacter] =useState(null);
    const [activeEnemy, setActiveEnemy] =useState(null);
    const [enemies, setEnemies] = useState([]);
    



    const nextStage = (stage) => {

        changeStage(stage);
    }

    const startCombatA = () => {
        setActiveEnemy(enemies[0])
        nextStage("CombatA")
    }

    const startPreCombat = () => {
        nextStage("PreCombat")
    }
    

    useEffect( () => {
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

    useEffect( () => {
        fetch("http://192.168.100.46:8080/enemies")
            .then(res=> res.json())
            .then(data=> setEnemies(data));
        }, [])
    
    

    return (
        <>
        {stage === "Start" ? 
        <CharacterForm users={characters} nextStage={nextStage} addCharacter={addCharacter} setActiveCharacter = {setActiveCharacter} />  : ""}
        {stage === "PreCombat" ? 
        <PreCombatScreen startCombatA={startCombatA}/> : ""}
        {stage === "CombatA" ?
        <CombatScreen activeCharacter={activeCharacter} activeEnemy={activeEnemy} setActiveEnemy = {setActiveEnemy} nextStage = {nextStage}/> : ""}
        {stage === "Success" ?
        <SuccessScreen startPreCombat={startPreCombat}/> : ""}
    </>
    );

  };


export default GameLogic;