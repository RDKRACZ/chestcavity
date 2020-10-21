package net.tigereye.chestcavity.items;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

public class VanillaOrgans {

    public static Map<Item,Map<Identifier,Float>> map = new HashMap<>();

    public static void init(){
        Map<Identifier,Float> dirt = new HashMap<>();
        dirt.put(CCItems.ORGANS_APPENDIX,1f/27);
        dirt.put(CCItems.ORGANS_HEART,1f/27);
        dirt.put(CCItems.ORGANS_MUSCLE,8f/27);
        dirt.put(CCItems.ORGANS_SPINE,1f/27);
        dirt.put(CCItems.ORGANS_LIVER,1f/27);
        dirt.put(CCItems.ORGANS_KIDNEY,2f/27);
        dirt.put(CCItems.ORGANS_SPLEEN,1f/27);
        dirt.put(CCItems.ORGANS_LUNG,2f/27);
        dirt.put(CCItems.ORGANS_INTESTINE,4f/27);
        dirt.put(CCItems.ORGANS_BONE,4f/27);
        dirt.put(CCItems.ORGANS_STOMACH,1f/27);
        Map<Identifier,Float> rottenFlesh = new HashMap<>();
        rottenFlesh.put(CCItems.ORGANS_MUSCLE,.5f);
        Map<Identifier,Float> animalFlesh = new HashMap<>();
        animalFlesh.put(CCItems.ORGANS_MUSCLE,.75f);
        Map<Identifier,Float> bone = new HashMap<>();
        rottenFlesh.put(CCItems.ORGANS_BONE,.5f);
        map.put(Items.DIRT,dirt);
        map.put(Items.ROTTEN_FLESH,rottenFlesh);
        map.put(Items.BEEF,animalFlesh);
        map.put(Items.PORKCHOP,animalFlesh);
        map.put(Items.MUTTON,animalFlesh);
        map.put(Items.BONE,bone);
    }
}