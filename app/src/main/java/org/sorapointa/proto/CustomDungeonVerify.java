package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CustomDungeonVerify {
    @Tag(tag=9) public Integer uid = null;
    @Tag(tag=15) public Integer lang = null;
    @Tag(tag=11) public Long dungeonGuid = null;
    @Tag(tag=7) public String region = null;
    @Tag(tag=13) public Integer timestamp = null;
}
