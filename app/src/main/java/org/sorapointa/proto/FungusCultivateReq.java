package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FungusCultivateReq {
    @Tag(tag=8) public Integer cultivateId = null;
    @Tag(tag=7) public Integer copyStep = null;
    @Tag(tag=11) public Integer exchangeStep = null;
    @Tag(tag=13) public Integer cultivateStep = null;
    @Tag(tag=15) public Integer rotateStep = null;
    @Tag(tag=6) public Integer undoStep = null;
    @Tag(tag=2) public Integer time = null;
    @Tag(tag=10) public Integer placeStep = null;
}
