export abstract class User {
  constructor(
    public nom: string,
    public prenom: string,
    public mail: string,
    public password: string,
    public telephone: string
  ) {}
}