package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ShowCommonTipsNotify {
    @Tag(tag=8) public String content = null;
    @Tag(tag=13) public String title = null;
    @Tag(tag=4) public Integer closeTime = null;
}
