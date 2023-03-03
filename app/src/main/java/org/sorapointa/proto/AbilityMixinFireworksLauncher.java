package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityMixinFireworksLauncher {
    @Tag(tag=2) public Integer invokeType = null;
    @Tag(tag=3) public Integer startCountDownTime = null;
    @Tag(tag=1) public Integer firedBulletCount = null;
    @Tag(tag=6) public Integer phase = null;
    @Tag(tag=4) public List<Integer> fireworksConfig = new ArrayList<>();
    @Tag(tag=7) public Integer turnIndex = null;
}
