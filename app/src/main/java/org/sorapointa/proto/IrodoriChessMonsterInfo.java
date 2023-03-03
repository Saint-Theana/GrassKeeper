package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriChessMonsterInfo {
    @Tag(tag=6) public Integer grantPoints = null;
    @Tag(tag=13) public Integer level = null;
    @Tag(tag=14) public Integer monsterId = null;
    @Tag(tag=11) public List<Integer> affixList = new ArrayList<>();
}
