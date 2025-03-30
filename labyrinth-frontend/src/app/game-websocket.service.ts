import {Injectable} from '@angular/core';
import {WebSocketSubject} from 'rxjs/internal/observable/dom/WebSocketSubject';

@Injectable({
  providedIn: 'root'
})
export class GameWebSocketService {
  private socket$: WebSocketSubject<any>;


  constructor() {
    this.socket$ = new WebSocketSubject('ws://localhost:8080/game-updates');
  }

  getGameUpdates() {
    return this.socket$;
  }

  sendMessage(message: any) {
    this.socket$.next(message);
  }
}
