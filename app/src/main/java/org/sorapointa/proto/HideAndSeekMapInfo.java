package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HideAndSeekMapInfo {
    @Tag(tag=11) public List<Integer> matchLockReasonList = new ArrayList<>();
    @Tag(tag=7) public Integer id = null;
}
