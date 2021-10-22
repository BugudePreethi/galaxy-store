import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddViewCartComponent } from './add-view-cart.component';

describe('AddViewCartComponent', () => {
  let component: AddViewCartComponent;
  let fixture: ComponentFixture<AddViewCartComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddViewCartComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddViewCartComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
