package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CrystalLinkSettleInfo {
    @Tag(tag=11) public Integer killNormalMosnterNum = null;
    @Tag(tag=6) public Boolean isNewRecord = null;
    @Tag(tag=13) public Integer finalScore = null;
    @Tag(tag=15) public Integer killEliteMonsterNum = null;
    @Tag(tag=3) public Integer difficultyId = null;
    @Tag(tag=10) public Integer levelId = null;
}
