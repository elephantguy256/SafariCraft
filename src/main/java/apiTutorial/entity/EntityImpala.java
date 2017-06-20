package apiTutorial.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.world.World;
import obsidianAPI.animation.wrapper.IEntityAnimated;

public class EntityImpala extends EntityCreature implements IEntityAnimated
{
	
	public EntityImpala(World world) 
	{
		super(world);
		this.tasks.taskEntries.clear();
        this.tasks.addTask(0, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(1, new EntityAIEat(this));	}
	
	@Override
	protected boolean isAIEnabled()
	{
	   return true;
	}

	@Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.18D);
    }

	@Override
	public boolean isMoving() {
		return limbSwingAmount > 0.02F;
	}
}