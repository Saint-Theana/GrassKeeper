package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ItemHint {
    @Tag(tag=12) public Integer count = null;
    @Tag(tag=8) public Long guid = null;
    @Tag(tag=13) public Integer itemId = null;
    @Tag(tag=14) public Boolean isNew = null;
}
