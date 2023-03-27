package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChessMonsterInfo {
    @Tag(tag=9) public Integer monsterId = null;
    @Tag(tag=2) public Integer level = null;
    @Tag(tag=3) public List<Integer> affixList = new ArrayList<>();
}
