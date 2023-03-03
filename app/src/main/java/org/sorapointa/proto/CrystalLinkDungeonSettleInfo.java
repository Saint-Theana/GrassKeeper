package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CrystalLinkDungeonSettleInfo {
    @Tag(tag=2) public Integer killEliteMonsterNum = null;
    @Tag(tag=6) public Integer finalScore = null;
    @Tag(tag=12) public Integer levelId = null;
    @Tag(tag=13) public Boolean isNewRecord = null;
    @Tag(tag=9) public Integer difficultyId = null;
    @Tag(tag=3) public Integer killNormalMonsterNum = null;
}
