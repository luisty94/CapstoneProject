import React from "react";
import styled, { ThemeProvider } from 'styled-components';
import { Button } from '../components/styles';
import { postAttack } from "../CharacterService";
import {updateEnemy} from "../containers/GameLogic"
import { postEnemyAttack } from "../EnemyService";
import ContainerBox from "../components/ContainerBox";
import Title from "../components/Title";
import TextBox from "../components/TextBox";



const StyledForm = styled.form`
    border-bottom: 1px solid black;
    display: flex;
    flex-direction: column;
    gap: 0.25rem;

    > * {
        margin: 0;
    }
`;




const CombatScreen = ({activeCharacter, activeEnemy, setActiveCharacter, setActiveEnemy, nextStage, }) => {
    const characterHealth = {...activeCharacter}
    const enemyHealth = {...activeEnemy}


    const attackButton = (event) => {
        event.preventDefault();
        
        console.log(event.target.characterId.value);
        console.log(event.target.enemyId.value)
       
        if (!event.target.enemyId.value){
            nextStage("End")}
        else{
        const attackObj = {
            characterId: event.target.characterId.value,
            enemyId: event.target.enemyId.value
        }

        postAttack(attackObj).then((res) => {

            setActiveEnemy(res)
            if (res.healthValue <= 0) {
                nextStage("Success")
            }
        })
    
        postEnemyAttack(attackObj).then((res) => {

            setActiveCharacter(res)
            if (res.healthValue <= 0) {
                nextStage("Retreat")
            }
        })
       
    }
    
}

    
    return (
        <ContainerBox>
            <Title>COMBAT SCREEN</Title>
            <StyledForm onSubmit={attackButton}>
                <input type="hidden" name="characterId" value={activeCharacter.id} />
                <input type="hidden" name="enemyId" value={activeEnemy.id} />
                <h1>Character : {activeCharacter.name}</h1>
                <h1>Health : {activeCharacter.healthValue}</h1>

                <h1>Enemy : {activeEnemy.name}</h1>
                <h1>Health : {activeEnemy.healthValue}</h1>
           
                <Button type="submit">ATTACK</Button>
            </StyledForm> 
        </ContainerBox>
    );
};



export default CombatScreen