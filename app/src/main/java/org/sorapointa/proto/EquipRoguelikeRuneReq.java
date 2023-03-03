package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EquipRoguelikeRuneReq {
    @Tag(tag=3) public List<Integer> runeList = new ArrayList<>();
}
