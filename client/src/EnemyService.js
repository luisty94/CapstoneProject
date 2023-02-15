const baseURL = 'http://localhost:8080/enemies/';

export const getAllEnemies = () => {
    return fetch(baseURL)
        .then(res => res.json())
}