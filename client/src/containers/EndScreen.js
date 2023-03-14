import ContainerBox from "../components/ContainerBox";
import React from "react";
import styled from "styled-components";
import Title from "../components/Title";
import TextBox from "../components/TextBox";
import Button from "../components/Button";
import { postEnemyHeal } from "../EnemyService";

const EndScreen = ({nextStage, enemies, setEnemies}) => {

    const onStartClick = (event) => {
        event.preventDefault();

        //  const enemyObj = {...enemies}
        //     enemyObj.id = [1, 2, 3, 4],
        //     enemyObj.type = ["GOBLIN", "ORC", "TROLL", "KOBOLD"],
        //     enemyObj.name = ["Mongo the Goblin", "Borkan the Orc", "Bobo the Troll", "Sir Reginald Frost III"],
        //     enemyObj.healthValue = [70, 150, 200, 10],
        //     enemyObj.speed = [90, 80, 50, 500],
        //     enemyObj.weapon = [{damage: 20, id: 1}, {damage: 30, id: 2}, {damage: 50, id: 4}, {damage: 10, id: 3} ]
            // const enemyObj = {...enemies}
            // enemyObj.id = [1, 2, 3, 4],
            // enemyObj.type = ["GOBLIN", "ORC", "TROLL", "KOBOLD"],
            // enemyObj.name = ["Mongo the Goblin", "Borkan the Orc", "Bobo the Troll", "Sir Reginald Frost III"],
            // enemyObj.healthValue = [70, 150, 200, 10],
            // enemyObj.speed = [90, 80, 50, 500],
            // enemyObj.weapon = [{damage: 20, id: 1}, {damage: 30, id: 2}, {damage: 50, id: 4}, {damage: 10, id: 3} ]
            
        //  setEnemies(enemyObj)
            // postEnemyHeal(enemyObj).then((res) => {
            //     setEnemies({
            //         ...enemies,
            //         healthValue: res.healthValue
            //     })
        nextStage("Start");
    // }) 
    }


    return (
        <ContainerBox>
            <Title>CONGRATULATIONS</Title>
            <TextBox>You have cleaned the forest from its filthy creatures</TextBox>
            <StartMenu>
                <Button onClick={onStartClick}>Try Again</Button>
            </StartMenu>
            
        </ContainerBox>
    )
}

const StartMenu = styled.div`
    display: flex;
    align-items: center;
    flex-direction: column;
    justify-content: center;
    padding: 1rem;

    button {
        width: 10rem;
    }
`

export default EndScreen;
