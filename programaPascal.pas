program completo;
var
    x, y: integer;
begin
    read(x);
    {read(y);
    read(x, y);}

    write(x);
    write('texto');
    {write(10);

    writeln(x);
    writeln('texto');
    writeln(10);

    for x := 1 to 10 do begin
        write(x);
        write(y);
    end;

    x := 1;
    repeat
        write(x);
        x := x + 1;
    until (x > 10);

    while (x >= 1) do begin
        write(x);
        x := x - 1;
    end;

    if (x >= 10) then
    begin
        write(x);
        write(y);
    end;

    if (x >= 10) then
    begin
        write(x);
        write(y);
    end
    else
    begin
        write(y);
        write(x);
    end;

    if (x >= 10 and y <= 10) then
    begin
        write(x);
        write(y);
    end;

    if (x >= 10 or y <= 10) then
    begin
        write(x);
        write(y);
    end;

    if (not (x >= 10)) then
    begin
        write(x);
        write(y);
    end;

    x := 10;}
end.