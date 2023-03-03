package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PersonalLineNewUnlockNotify {
    @Tag(tag=9) public List<Integer> personalLineIdList = new ArrayList<>();
}
