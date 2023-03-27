package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HideAndSeekMapInfo {
    @Tag(tag=7) public Integer id = null;
    @Tag(tag=5) public List<Integer> matchLockReasonList = new ArrayList<>();
}
