import { Component, OnInit } from '@angular/core';
import { GameWebSocketService } from '../game-websocket.service';

@Component({
  selector: 'app-game',
  templateUrl: './game.component.html',
  styleUrls: ['./game.component.css']
})
export class GameComponent implements OnInit {
  monsterX: number = 0;
  monsterY: number = 0;

  constructor(private gameWebSocketService: GameWebSocketService) {}

  ngOnInit() {
    this.gameWebSocketService.getGameUpdates().subscribe((gameState) => {
      this.monsterX = gameState.monsterX;
      this.monsterY = gameState.monsterY;
    });
  }
}
