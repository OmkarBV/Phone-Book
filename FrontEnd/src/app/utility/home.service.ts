import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class HomeService {
  baseURL = 'http://localhost:8080/contact/';
  constructor(private http: HttpClient) {}

  getAllConatact(email: any) {
    return this.http.get(this.baseURL + 'getall/' + email);
  }
  searchByName(email: any, name: any) {
    return this.http.get(this.baseURL + 'searchbyname/' + email + '/' + name);
  }
  searchByNumber(email: any, number: any) {
    return this.http.get(
      this.baseURL + 'searchbynumber/' + email + '/' + number
    );
  }

  sortASC(email: any) {
    return this.http.get(this.baseURL + 'sortasc/' + email);
  }

  sortDESC(email: any) {
    return this.http.get(this.baseURL + 'sortdesc/' + email);
  }
}
