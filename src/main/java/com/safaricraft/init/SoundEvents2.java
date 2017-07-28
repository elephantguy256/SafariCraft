package com.safaricraft.init;

import com.safaricraft.main.SafariCraft;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class SoundEvents2
{
    public static SoundEvent LION;
    public static SoundEvent LION_MOAN;
    public static SoundEvent ZEBRA;
    public static SoundEvent ZEBRA2;
    public static SoundEvent ELEPHANT;
    public static SoundEvent SPOTTED_HYENA;
    public static SoundEvent SPOTTED_HYENA2;
    public static SoundEvent LYCAON;
    public static SoundEvent LYCAON2;
    public static SoundEvent LIONROAR;
    public static SoundEvent LEOPARD;
    public static SoundEvent RATEL;
    public static SoundEvent RATEL_HURT;
    public static SoundEvent Rhino;
    public static SoundEvent GORILLA;
    public static SoundEvent LEOPARD_DEATH;
    public static SoundEvent LEOPARD_ATTACK;
    public static SoundEvent CHEETAH;
	public static SoundEvent BABOON;
    /**
     * Register the {@link SoundEvent}s.
     */
    public static void registerSounds()
    {
        LION = registerSound("mob.lion.roar");
        LIONROAR = registerSound("mob.lion.roar2");
        LION_MOAN = registerSound("mob.lion.hurt");
        ZEBRA = registerSound("mob.zebra.wat");
        ZEBRA2 = registerSound("mob.zebra.wat2");
        ELEPHANT = registerSound("mob.elephant.trumpet");
        SPOTTED_HYENA = registerSound("mob.hyena.cackle");
        SPOTTED_HYENA2 = registerSound("mob.hyena.cackle2");
        LYCAON = registerSound("mob.africanwilddog.bark");
        LYCAON2 = registerSound("mob.africanwilddog.bark2");
        LEOPARD = registerSound("mob.leopard.growl");
        LEOPARD_DEATH = registerSound("mob.leopard.death");
        LEOPARD_ATTACK = registerSound("mob.leopard.attack");
        RATEL_HURT = registerSound("mob.ratel.hurt");
        RATEL = registerSound("mob.ratel.aggro");
        CHEETAH = registerSound("mob.cheetah.aggro");
        Rhino = registerSound("mob.rhino.grunt");
        GORILLA = registerSound("mob.gorilla.roar");
        BABOON = registerSound("mob.baboon.bark");
    
    }

    /**
     * Register a {@link SoundEvent}.
     *
     * @param soundName The SoundEvent's name without the testmod3 prefix
     * @return The SoundEvent
     */
    private static SoundEvent registerSound(String soundName)
    {
        final ResourceLocation soundID = new ResourceLocation(SafariCraft.MODID, soundName);
        return SoundEventRegister.register(new SoundEvent(soundID).setRegistryName(soundID));
    }
}