package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EntityConfigHashEntry.*;
import org.sorapointa.proto.EntityConfigHashEntry;

public class EntityConfigHashNotify {
    @Tag(tag=3) public List<EntityConfigHashEntry> abilityEntryList = new ArrayList<>();
    @Tag(tag=15) public List<EntityConfigHashEntry> avatarEntryList = new ArrayList<>();
    @Tag(tag=8) public List<EntityConfigHashEntry> combatEntryList = new ArrayList<>();
}
