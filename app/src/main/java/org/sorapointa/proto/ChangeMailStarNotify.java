package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChangeMailStarNotify {
    @Tag(tag=14) public Boolean isStar = null;
    @Tag(tag=2) public List<Integer> mailIdList = new ArrayList<>();
}
