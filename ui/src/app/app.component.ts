import { Component, OnInit } from '@angular/core';
import { ApplicationService } from './services/application.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = '';

  constructor(private applicationService: ApplicationService) {
  }

  ngOnInit() {
    this.applicationService.getApplicationName().subscribe((resp: any) => {
      this.title = resp;
    })
  }
}