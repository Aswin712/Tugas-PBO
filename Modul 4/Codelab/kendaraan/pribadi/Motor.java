package kendaraan.pribadi;

import kendaraan.Kendaraan;

public abstract class Motor extends Kendaraan {
    @Override
    public void Star() {
        System.out.println("Motor " + this.getName() + "dinyalakan");}

    @Override
    public void Stop() {
        System.out.println("Motor " + this.getName() + " dimatikan");
    }

    @Override
    public void Brake() {
        System.out.println("Motor berhenti");
    }
}
