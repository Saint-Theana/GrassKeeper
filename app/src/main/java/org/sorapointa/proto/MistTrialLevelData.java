package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MistTrialLevelData {
    @Tag(tag=1) public Integer openTime = null;
    @Tag(tag=12) public Boolean isOpen = null;
    @Tag(tag=7) public Integer levelId = null;
}
