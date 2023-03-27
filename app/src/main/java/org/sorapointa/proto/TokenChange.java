package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TokenChange {
    @Tag(tag=6) public Integer cardGuid = null;
    @Tag(tag=5) public Integer after = null;
    @Tag(tag=15) public Integer before = null;
    @Tag(tag=8) public Integer tokenType = null;
    @Tag(tag=12) public Integer reason = null;
}
