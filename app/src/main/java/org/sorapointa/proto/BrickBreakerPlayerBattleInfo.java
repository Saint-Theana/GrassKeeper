package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BrickBreakerPlayerBattleInfo {
    @Tag(tag=9) public List<Integer> skillList = new ArrayList<>();
    @Tag(tag=6) public Boolean isReady = null;
    @Tag(tag=15) public String nickname = null;
    @Tag(tag=14) public Boolean isChanging = null;
    @Tag(tag=12) public List<Integer> costumeId = new ArrayList<>();
    @Tag(tag=5) public List<Integer> avatarId = new ArrayList<>();
    @Tag(tag=3) public Integer uid = null;
}
