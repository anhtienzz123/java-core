package comjava.udemy.designpattern.creational.prototype;

public class SwordsMan extends GameUnit {

    private CombatMechanism state = CombatMechanism.DEFENSE;

    @Override
    protected void resetUnit() {
        this.state = CombatMechanism.DEFENSE;
    }

    public void setState(CombatMechanism combatMechanism) {
        this.state = combatMechanism;
    }

    @Override
    public String toString() {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("== SwordsMan");
        sqlBuilder.append("\n point: " + getPoint());
        sqlBuilder.append("\n state: " + this.state);
        
        return sqlBuilder.toString();
    }
}
