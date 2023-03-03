package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ItemHint {
    @Tag(tag=8) public Integer itemId = null;
    @Tag(tag=2) public Boolean isNew = null;
    @Tag(tag=15) public Integer count = null;
    @Tag(tag=4) public Long guid = null;
}
