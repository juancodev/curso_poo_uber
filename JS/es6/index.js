'use strict';

import Car from './Car';
import Account from './Account';

const carES6 = new Car("QWE123", new Account("Juan Carlos", "V263"));
carES6.passenger = 4;
carES6.printDataCar();