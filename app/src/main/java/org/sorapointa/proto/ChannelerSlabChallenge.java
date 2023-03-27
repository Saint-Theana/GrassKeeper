package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannelerSlabChallenge {
    @Tag(tag=15) public List<ChannelerSlabCamp> campList = new ArrayList<>();
    @Tag(tag=14) public Integer activeCampIndex = null;
}
