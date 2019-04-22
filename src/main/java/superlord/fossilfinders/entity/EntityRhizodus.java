package superlord.fossilfinders.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.world.World;

public class EntityRhizodus extends EntityAIWanderSwim {

	public EntityRhizodus(World world) {
		super(world);
		this.setSize(1.0F, 1.0F);
	}

	@Override
	public EntityRhizodus createChild(EntityAgeable ageable) {
        return new EntityRhizodus(this.world);
	}

	@Override
	public String getTexture() {
		return null;
	}

	@Override
	protected double getSwimSpeed() {
		return 2;
	}

}
