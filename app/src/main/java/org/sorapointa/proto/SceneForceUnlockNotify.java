package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneForceUnlockNotify {
    @Tag(tag=10) public Boolean isAdd = null;
    @Tag(tag=2) public List<Integer> forceIdList = new ArrayList<>();
}
