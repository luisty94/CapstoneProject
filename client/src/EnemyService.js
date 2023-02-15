const baseURL = 'http://localhost:8080/enemies/';

export const getAllEnemies = () => {
    return fetch(baseURL)
        .then(res => res.json())
}

export const postEnemyAttack = (payload) => {
    return fetch(baseURL + "combat", {
        method: 'POST',
        body: JSON.stringify(payload),
        headers: { 'Content-Type': 'application/json' }
    })
    .then(res => res.json())
}