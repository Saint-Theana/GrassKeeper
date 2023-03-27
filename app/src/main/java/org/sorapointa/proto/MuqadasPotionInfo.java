package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MuqadasPotionInfo {
    @Tag(tag=13) public Integer skillUseLimit = null;
    @Tag(tag=14) public Integer score = null;
    @Tag(tag=3) public Integer skillEnergy = null;
    @Tag(tag=5) public Integer captureWeaknessCount = null;
}
