package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EntityConfigHashNotify {
    public enum EntityConfigHashNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3265) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=12) public List<EntityConfigHashEntry> avatarEntryList = new ArrayList<>();
    @Tag(tag=7) public List<EntityConfigHashEntry> abilityEntryList = new ArrayList<>();
    @Tag(tag=1) public List<EntityConfigHashEntry> combatEntryList = new ArrayList<>();
}
