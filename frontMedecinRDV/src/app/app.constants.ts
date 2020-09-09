import { Injectable } from '@angular/core';
import { environment } from '../environments/environment';

/* Supprimer le Injectable car un service singleton ne sert a rien. Remplacer par des constantes statics final */

/* après pour le p'tit plus, transformer l'appli en PWA  https://formationjavascript.com/pwa-avec-angular-en-10-etapes/*/
@Injectable({
  providedIn: 'root'
})
export class Ressources {
  public urlfrontEnd = environment.urlPortal;
  public urlBackEnd = environment.urlBackEnd;

  public urlUsers = 'api/users';
  public urlMedecins = 'api/medecins';
  public urlPatients = 'api/patients';
}
