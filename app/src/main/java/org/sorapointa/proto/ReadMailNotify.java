package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReadMailNotify {
    @Tag(tag=2) public List<Integer> mailIdList = new ArrayList<>();
}
