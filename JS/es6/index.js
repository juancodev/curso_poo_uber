'use strict';

import Car from './Car';
import Account from './Account';
import UberX from './uberX';

const carES6 = new Car("QWE123", new Account("Juan Carlos", "V263"));
carES6.passenger = 4;
carES6.printDataCar();

const uberX = new UberX("ABC123", new Account("Juan Carlos", "V263"), "Toyota", "Corolla")
uberX.printDataCar();