package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ServerCombatEndNotify {
    @Tag(tag=14) public List<Integer> combatEndTypeList = new ArrayList<>();
}
