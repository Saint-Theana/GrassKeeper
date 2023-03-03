package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSChangeFieldReq {
    @Tag(tag=6) public Integer fieldId = null;
    @Tag(tag=11) public Integer deckId = null;
}
