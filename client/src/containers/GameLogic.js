import React, { useState, useEffect } from 'react';
import { getAllCharacters } from '../CharacterService';
import { postCharacter } from '../CharacterService';

import CharacterForm from './CharacterForm';
import PreCombatScreen from './PreCombatScreen';
import CombatScreen from './CombatScreen';
import SuccessScreen from './SuccessScreen';
import StartScreen from './StartScreen';


const GameLogic = () => {

    const [stage, changeStage] = useState("Start");
    const [characters, setCharacters] = useState([]);
    const [activeCharacter, setActiveCharacter] =useState(null);
    const [activeEnemy, setActiveEnemy] =useState(null);
    const [enemies, setEnemies] = useState([]);
    



    const nextStage = (stage) => {

        changeStage(stage);
    }

    const startCharacterCreator = () => {
        nextStage("Creator")
    }

    const startCombatA = () => {
        const enemy = enemies.find(enemy => enemy.healthValue > 0)
        setActiveEnemy({...enemy})
        nextStage("CombatA")
    }

    const startPreCombat = () => {
        nextStage("PreCombat")
    }
    

    useEffect( () => {
    fetch("http://localhost:8080/characters")
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
        fetch("http://localhost:8080/enemies")
            .then(res=> res.json())
            .then(data=> setEnemies(data));
        }, [activeEnemy])
    
    

    return (
        <>
        {stage === "Start" ?
        <StartScreen nextStage={nextStage} startCharacterCreator={startCharacterCreator}/> : ""}
        {stage === "Creator" ? 
        <CharacterForm users={characters} nextStage={nextStage} addCharacter={addCharacter} setActiveCharacter = {setActiveCharacter} />  : ""}
        {stage === "PreCombat" ? 
        <PreCombatScreen startCombatA={startCombatA}/> : ""}
        {stage === "CombatA" ?
        <CombatScreen activeCharacter={activeCharacter} activeEnemy={activeEnemy} setActiveEnemy = {setActiveEnemy} setActiveCharacter = {setActiveCharacter} nextStage = {nextStage}/> : ""}
        {stage === "Success" ?
        <SuccessScreen startPreCombat={startPreCombat} activeCharacter = {activeCharacter} setActiveCharacter = {setActiveCharacter}/> : ""}
    </>
    );

  };


export default GameLogic;