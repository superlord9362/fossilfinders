package superlord.fossilfinders.entity;

import net.minecraft.entity.Entity;

public enum EntityType {
	
	HIBBERTOPTERUS(EntityHibbertopterus.class, MobType.EURYPTERIDA, TimePeriod.PALEOZOIC, Diet.CARNIVORE);

	private final Class<? extends Entity> entity;
	public MobType type;
	public Diet diet;
	public TimePeriod period;
	
	EntityType(Class <? extends Entity> entity, MobType type, TimePeriod period, Diet diet) {
		this.entity = entity;
		this.type = type;
		this.period = period;
		this.diet = diet;
	}
	
}
