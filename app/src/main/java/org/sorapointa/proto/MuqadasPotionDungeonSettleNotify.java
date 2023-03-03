package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MuqadasPotionDungeonSettleNotify {
    @Tag(tag=11) public Integer finalScore = null;
    @Tag(tag=15) public Integer captureWeaknessCount = null;
    @Tag(tag=6) public Boolean isSuccess = null;
    @Tag(tag=10) public Integer levelId = null;
    @Tag(tag=2) public Boolean isNewRecord = null;
}
